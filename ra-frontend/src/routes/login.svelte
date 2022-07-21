<script>
    import AppHeader from '../lib/app-header.svelte'
    import InputField from '../lib/form/input-field.svelte'
    import Button from '../lib/button.svelte'
</script>

<AppHeader/>
<section class="page container login">
    <InputField/>
    <InputField/>
    <Button class="login__button" text="Login"/>
</section>

<style lang="scss">
  @import "../styles/theme";

  .login {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 1rem;
    margin-left: auto;
    margin-right: auto;
    width: fit-content;

    :global(.login__button) {
      align-self: flex-end;
    }
  }
</style>